package ee.ria.dhx.server.endpoint.config;


import ee.ria.dhx.server.config.DhxServerConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.WsConfigurationSupport;
import org.springframework.ws.server.endpoint.adapter.DefaultMethodEndpointAdapter;
import org.springframework.ws.server.endpoint.adapter.method.MarshallingPayloadMethodProcessor;
import org.springframework.ws.server.endpoint.adapter.method.MessageContextMethodArgumentResolver;
import org.springframework.ws.server.endpoint.adapter.method.MethodArgumentResolver;
import org.springframework.ws.server.endpoint.adapter.method.MethodReturnValueHandler;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;

import java.util.ArrayList;
import java.util.List;


/**
 * Creates beans needed for DHX webservices.
 * 
 * @author Aleksei Kokarev
 *
 */
@Configuration
@ComponentScan(basePackages = "ee.ria.dhx.server.endpoint")
public class DhxServerEndpointConfig extends WsConfigurationSupport {

  @Autowired
  DhxServerConfig config;

  @Autowired
  Jaxb2Marshaller marshaller;

  /**
   * Injects DefaultMethodEndpointAdapter which supports SOAP message attachments. Sets proper
   * marshaller. That bean might iterfere with another same bean if it is defined(in that case most
   * probably code need to be changed to define single bean which will staisfy both needs).
   * 
   * @return DefaultMethodEndpointAdapter
   */
  @Bean(name = "dhxServerMethodEndpointAdapter")
  public DefaultMethodEndpointAdapter dhxMethodEndpointAdapter() {
    List<MethodArgumentResolver> argumentResolvers = null;
    List<MethodReturnValueHandler> returnValueHandlers = null;
    if (argumentResolvers == null) {
      argumentResolvers = new ArrayList<MethodArgumentResolver>();
    }
    if (returnValueHandlers == null) {
      returnValueHandlers = new ArrayList<MethodReturnValueHandler>();
    }
    returnValueHandlers.addAll(methodProcessors());
    argumentResolvers.addAll(methodProcessors());


    argumentResolvers.add(new MessageContextMethodArgumentResolver());

    returnValueHandlers.addAll(defaultMethodEndpointAdapter().getMethodReturnValueHandlers());
    argumentResolvers.addAll(defaultMethodEndpointAdapter().getMethodArgumentResolvers());

    DefaultMethodEndpointAdapter adapter = new DefaultMethodEndpointAdapter();
    adapter.setMethodArgumentResolvers(argumentResolvers);
    adapter.setMethodReturnValueHandlers(returnValueHandlers);
    return adapter;
  }

  /**
   * Method returns bean List of MarshallingPayloadMethodProcessors.
   * 
   * @return bean List of MarshallingPayloadMethodProcessors
   */
  @Bean(name = "dhxServerMethodProcessors")
  public List<MarshallingPayloadMethodProcessor> methodProcessors() {
    List<MarshallingPayloadMethodProcessor> retVal =
        new ArrayList<MarshallingPayloadMethodProcessor>();
    Jaxb2Marshaller marshallerMtom = marshaller;
    retVal.add(new MarshallingPayloadMethodProcessor(marshallerMtom));

    return retVal;
  }


  /**
   * Defines WSDL v1.
   * 
   * @return SimpleWsdl11Definition
   */
  @Bean(name = "dhlv1")
  public SimpleWsdl11Definition wsdl11Definitionv1() {
    Resource wsdlResource = new ClassPathResource(config.getWsdlFilev1());
    SimpleWsdl11Definition wsdlDef = new SimpleWsdl11Definition(wsdlResource);
    return wsdlDef;
  }

  /**
   * Defines WSDL v2.
   * @return SimpleWsdl11Definition
   */
  @Bean(name = "dhlv2")
  public SimpleWsdl11Definition wsdl11Definitionv2() {
    Resource wsdlResource = new ClassPathResource(config.getWsdlFilev2());
    SimpleWsdl11Definition wsdlDef = new SimpleWsdl11Definition(wsdlResource);
    return wsdlDef;
  }

  /**
   * Defines WSDL v3.
   * @return SimpleWsdl11Definition
   */
  @Bean(name = "dhlv3")
  public SimpleWsdl11Definition wsdl11Definitionv3() {
    Resource wsdlResource = new ClassPathResource(config.getWsdlFilev3());
    SimpleWsdl11Definition wsdlDef = new SimpleWsdl11Definition(wsdlResource);
    return wsdlDef;
  }

  /**
   * Defines WSDL v4.
   * @return SimpleWsdl11Definition
   */
  @Bean(name = "dhlv4")
  public SimpleWsdl11Definition wsdl11Definitionv4() {
    Resource wsdlResource = new ClassPathResource(config.getWsdlFilev4());
    SimpleWsdl11Definition wsdlDef = new SimpleWsdl11Definition(wsdlResource);
    return wsdlDef;
  }


}
