class newswitch{
     public static void main(String a[])
     {
          
          String day="monday";
          String result="";
          result=switch(day)
          {
               case "monday" -> "hectic";
               case "sunday" -> "weekend";
               default -> "bearable";
          };
          System.out.println(result);
          
     }
}
