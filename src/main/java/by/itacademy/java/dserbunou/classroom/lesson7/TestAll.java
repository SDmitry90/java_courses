package by.itacademy.java.dserbunou.classroom.lesson7;

public class TestAll {

    public static void main(String[] args) {
        printClassVersion(new Test());
        printClassVersion(new Test2());
        printClassVersion(new Test3());
        printClassVersion(new Object());
        printClassVersion(new String());
    }

    static void printClassVersion(final Object o) {
        final Version versionMetadata = o.getClass().getAnnotation(Version.class);

        System.out.printf("obeject %s version=%s\n", o.hashCode(),
                versionMetadata == null ? "not specified" : versionMetadata.info());
    }

}
