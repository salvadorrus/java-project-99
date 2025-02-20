//package hexlet.code.controller;
//
//import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.jwt;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
//import hexlet.code.repository.UserRepository;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.servlet.MockMvc;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//class UsersControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Test
//    public void testIndex() throws Exception {
//        var result = mockMvc.perform(get("/api/users").with(jwt()))
//                .andExpect(status().isOk())
//                .andReturn();
//
//        var body = result.getResponse().getContentAsString();
//        assertThatJson(body).isArray();
//    }
//
////    @Test
////    void show() {
////    }
////
////    @Test
////    void create() {
////    }
////
////    @Test
////    void update() {
////    }
////
////    @Test
////    void delete() {
////    }
//}
