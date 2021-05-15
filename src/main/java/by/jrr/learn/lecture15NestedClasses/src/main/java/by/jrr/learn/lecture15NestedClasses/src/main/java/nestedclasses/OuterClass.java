package nestedclasses;

public class OuterClass {

    private String outerName;
    public static int EXAMPLE;
    private InnerClass innerClass;

    public String getOuterName() {
        return outerName;
    }

    public class InnerClass {
        private String innerName;
        private static final int AGE = 10;

        public InnerClass() {

        }
        public InnerClass(String innerName) {

        }

        public String getOuterName() {
            return OuterClass.this.outerName;
        }

    }

    public static class StaticNestedClass {
        private String nestedName;
        public static int counter;

        public String getNestedName() {
            return nestedName;
        }
       public static int getStaticFieldInOutherClass() {
            return OuterClass.EXAMPLE;
       }
        public static class InnerInnerClass{

        }
    }
}
