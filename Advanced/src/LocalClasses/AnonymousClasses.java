package LocalClasses;

public class AnonymousClasses {

    public static void main(String[] args) {
        Robot jan = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("dzien dobry");
            }
        });
        Robot john = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("good morning");
            }
        });

        Robot adolf = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Guten Tag!!!!!");
            }
        });

        jan.saySomething();
        john.saySomething();
        adolf.saySomething();
    }

    public interface GreetingModule {
        void sayHello();
    }

    public static class Robot {
        private final GreetingModule greetingModule;

        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }

        public void saySomething() {
            greetingModule.sayHello();
        }
    }


}
