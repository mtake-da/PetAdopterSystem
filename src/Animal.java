import java.util.Objects;
public class Animal {
        private String name;
        private int age;
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        @Override
        public String toString() {
            return name + " (" + age + " years old)";
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Animal)) return false;
            Animal animal = (Animal) obj;
            return age == animal.age && Objects.equals(name, animal.name);
        }
        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }    
}
