package session2;
    public class Student {
        private String name;
        private String javaLevel;


        public void setName (String name) {
        this.name = name;

            }
    public void setJavaLevel(String JavaLevel) {
        javaLevel = JavaLevel;
        this.javaLevel = javaLevel;
    }



        public void printDetails() {
        System.out.println(name + " Java skills level is " + javaLevel);
    }
}
