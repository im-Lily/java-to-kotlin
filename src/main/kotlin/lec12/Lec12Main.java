package lec12;

public class Lec12Main {

    public static void main(String[] args) {
        /*
         companion object 이름을 통한 접근
         기본 이름은 Companion
         */
        Person.Factory.newBaby("lily");

        // @JvmStatic 어노테이션이 붙어있을 경우, 바로 접근 가능
        Person.newBaby("jeong");
    }
}
