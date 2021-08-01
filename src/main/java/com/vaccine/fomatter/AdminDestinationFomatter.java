//package com.vaccine.fomatter;
//
//import com.vaccine.model.Destination;
//import com.vaccine.service.admindestination.AdminDestinationService;
//import com.vaccine.service.admindestination.IAdminDestinationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.format.Formatter;
//import org.springframework.stereotype.Component;
//
//import java.text.ParseException;
//import java.util.Locale;
//import java.util.Optional;
//
//@Component
//public class AdminDestinationFomatter implements Formatter<Destination> {
//    private AdminDestinationService adminDestinationService;
//
//    @Autowired
//    public AdminDestinationFomatter(IAdminDestinationService adminDestinationService){
//        this.adminDestinationService = (AdminDestinationService) adminDestinationService;
//    }
//    @Override
//    public Destination parse(String text, Locale locale) throws ParseException {
//        Optional<Destination> adminDestinationOptional = adminDestinationService.findById(Long.parseLong(text));
//        return adminDestinationOptional.orElse(null);
//    }
//    @Override
//    public String print(Destination object, Locale locale) {
//        return "[" + object.getId() + ", " +object.getNameDestination() + "]";
//    }
//}
