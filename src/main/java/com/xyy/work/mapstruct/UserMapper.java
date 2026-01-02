package com.xyy.work.mapstruct;

import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {SexConverter.class})
public interface UserMapper {
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(source = "sex", target = "sex", qualifiedByName = "intToSexName")
    UserDTO userToUserDTO(User user);

    @Mapping(source = "sex", target = "sex", qualifiedByName = "intToSexName")
//    @Mapping(target = "createdAt", ignore = true)
    UserVO userToUserVO(User user);

    @Mapping(target = "sex", source = "sex", qualifiedByName = "sexNameToInt")
    User userDTOToUser(UserDTO userDTO);

    @Mapping(target = "sex", source = "sex", qualifiedByName = "sexNameToInt")
//    @Mapping(target = "updatedAt", ignore = true)
    User userVOToUser(UserVO userVO);
}
