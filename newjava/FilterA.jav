public class FilterA {
    public static void main(String[] args) {
        
        List<String> name=Arrays.asList("Amit","Ravi","Anil","Vikas","Ashok");
        ArrayList<String> list=new ArrayList<String>();
        list.addAll(names);
        List<String> listA=list.stream().filter(name->name.startsWith("A")).toList();
        System.out.println(listA);
    }
}