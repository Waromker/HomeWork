package testEnum;

public class EnumTest {
    public static void main(String[] args) {
        TestEnum[] values = TestEnum.values();

        for (TestEnum testEnum : values) {
            if (testEnum == TestEnum.N2)
            testEnum.printVeryImportantInformation(); //DOES NOT WORK

        }
    }
}
