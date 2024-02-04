package somethingElse;

import otherPackage.OtherClass;

public class AccessClass extends OtherClass
{
   public static void main(String[] args)
   {
      OtherClass otherClass = new OtherClass();
//      test();
   }
   
   void function() {
      test();
   }
}
