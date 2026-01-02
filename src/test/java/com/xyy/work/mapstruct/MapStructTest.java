package com.xyy.work.mapstruct;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.Date;
import java.util.List;

@SpringBootTest
@TestPropertySource(properties = {
        "spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration"
})
public class MapStructTest {
    @Autowired
    private UserMapper userMapper;
    private final static Logger logger = LoggerFactory.getLogger(MapStructTest.class);

    @Test
    public void test() {
        Hobby hobby = new Hobby("reading", "reading books");
        Hobby hobby2 = new Hobby("swimming", "swimming");
        User user = new User("xyy", 18, SexType.MAIL.getCode(), List.of(hobby, hobby2), new Date(), new Date());
        logger.info("user: {}", user);
        UserDTO userDTO = userMapper.userToUserDTO(user);
        UserVO userVO = userMapper.userToUserVO(user);
        logger.info("userDTO: {}", userDTO);
        logger.info("userVO: {}", userVO);
        userDTO.setName("xyy1");
        userVO.setName("xyy2");
        logger.info("user1: {}", userMapper.userDTOToUser(userDTO));
        logger.info("user2: {}", userMapper.userVOToUser(userVO));

    }
}
