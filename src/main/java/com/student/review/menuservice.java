package com.student.review;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Vector;

@Service
@RequiredArgsConstructor
public class menuservice {
    private final MenuRespository menurepository;
    private static  final String activeMenuStatus = "1";
    ValidationService validationService = new DefaultValidationService();
    MenuMapper menuMapper = new MenuMapper();
    @Transactional
    List<MenuDto> get_all_menus(){
        List<MenuEntity> m2 = new ArrayList<>();
        try{
            List<MenuEntity> m1 = menurepository.findAll();
            for(MenuEntity m: m1){
                if(m.getStatus == activeMenuStatus){
                    validationService.validate(m);
                    if(m.type == "SPECIAL"){
                        continue;
                    }
                    m2.add(menuMapper.toDto(m));
                }
            }

        }catch (Exception ex){
            return  new ArrayList<>();
        }

        return m2;
    }
}
