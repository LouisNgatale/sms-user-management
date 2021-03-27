//package i.louis.sms_management_service;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
//
//@Configuration
//public class WebMvcConfig {
//    @Bean
//    public OpenEntityManagerInViewFilter primaryOpenEntityManagerInViewFilter() {
//        OpenEntityManagerInViewFilter osivFilter =
//                new OpenEntityManagerInViewFilter();
//        osivFilter.setEntityManagerFactoryBeanName
//                ("studentEntityManagerFactory");
//        return osivFilter;
//    }
//
//    @Bean
//    public OpenEntityManagerInViewFilter reportingOpenEntityManagerInViewFilter() {
//        OpenEntityManagerInViewFilter osivFilter =
//                new OpenEntityManagerInViewFilter();
//        osivFilter.setEntityManagerFactoryBeanName
//                ("employeeEntityManagerFactory");
//        return osivFilter;
//    }
//}