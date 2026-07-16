class ArrayList{
    public static void main(String[] args) {
        java.util.ArrayList<String> students = new java.util.ArrayList<>();
        students.add("Neeraj");
        students.add("Vishal");
        students.add("Vivek");
        students.add("Neelam");
        System.out.println(students);
        students.add(2,"Parul");
        System.out.println(students);
        students.remove("Neelam");
        System.out.println(students.contains("Vivek"));
    }
}