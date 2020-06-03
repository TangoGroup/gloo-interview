package us.gloo.roster;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StudentRosterTest {
    private final StudentRoster roster = new StudentRoster();

    @Test
    void testStep1() {
        // Returns the average number of courses taken by each student
        assertEquals(3.26, roster.step1());
    }

    @Test
    void testStep2() {
        // Returns the correct list of course numbers
        var expectedCourses = Arrays.asList("cs3240", "cs7520");
        var result = roster.step2();
        Collections.sort(result);
        Collections.sort(expectedCourses);

        assertEquals(expectedCourses, result);
    }

    @Test
    void testStep3() {
        // Returns the correct list of student ids
        var expectedIds = Arrays.asList(
                "b33248b6-6646-428f-b813-aa646871195c",
                "a0e7c64e-aa6e-4bd6-a146-26d46f0729f8",
                "fc6b2772-3c54-4888-b1aa-5acb715ed6c3",
                "738d0a73-e989-4b4c-86ee-f67c2598bcd9",
                "0b4dbe4f-b145-4d2e-8ceb-bdcf6cd4e0ef",
                "d1311d80-013f-435f-b228-4b85d50bdc89",
                "e00d69af-9f4b-4d40-9f20-7201e3c467c3",
                "6f0fea41-df3d-44c5-a3b4-ee1677b16ba3",
                "356f6cfa-ee74-4384-beb3-68b51076df0e",
                "e28a6cab-9272-4aa3-a0e5-1ae910d2c800",
                "c04c9edf-b318-4a2a-a30d-ca858c9096f2",
                "514eadc0-0344-407a-aff8-d25bcad36a9e",
                "7b1469ce-3729-456e-8bb5-963f26d20db0",
                "b8baa1c6-ea39-4615-84e0-5e8e7577f778",
                "30d2c4ba-b664-495a-8402-f4877d600df8",
                "6e8df47c-fd4c-4008-99b0-d8147987d837",
                "cdc8c32b-5557-4fc4-85a3-4f67e508c35a",
                "5aca80f4-ad2b-400b-a3b8-a5dfa537569d",
                "6d04da03-ecf7-463c-8f62-b675993c1d2a",
                "f90f5aa7-1eff-4817-8999-dd570ef559f8",
                "d9104410-12c9-4080-9306-efa9d0b6f340",
                "25f01630-7bab-4e38-8483-f2a565ad093c",
                "f5e6bc06-1398-4e72-a384-a293c4a2eccf",
                "30fc3775-aee9-4553-83f6-9654a819750f",
                "fcba667d-001b-422e-b9b3-c8bf63d000f6",
                "0b2f7b37-e603-449a-94da-3d6bc289122b",
                "8a80262c-da88-4359-8ddd-203821d970df",
                "8a11b40d-ae65-410f-b679-19a950cb73ed",
                "5213c333-b89f-4823-8052-fd180050aba0",
                "59aa96f1-314b-4525-a24c-62d0f7fa3f00",
                "10c6c60d-dfd2-4e02-a25c-10eb38deeff6",
                "5a75c660-9f99-487c-a38e-7f717a71e192",
                "cca302e3-a9d0-43da-ada2-bd10a31752bf",
                "e71f6dd6-6fa5-4bc7-801e-3fc63c5be487",
                "1ca04d09-ebbd-4f90-91de-cd1505f19d8f",
                "d9144b2f-b3f1-4cee-932a-0ea8426be512",
                "c9246528-e5b1-488b-b39b-91cabfee0c46",
                "27e298c7-a547-4523-969d-33f4c2e7d763",
                "7b8b256c-4fb1-456f-b793-2123d4e36fe1",
                "b51d6d9e-28f4-4df6-97f3-99127b4f0290",
                "87cc589c-b980-4d51-ba90-878567cd4d01",
                "ecb0e3aa-d25c-43fc-8934-9146ffce030e",
                "ad0778d0-4b7b-44b3-b16d-dc14081c1508",
                "65df9be1-7665-406c-b81c-850c4b9fcafd");
        var result = roster.step3();
        Collections.sort(result);
        Collections.sort(expectedIds);

        assertEquals(expectedIds, result);
    }
}