package otherPackage;

public abstract class TestFinal
{
   void function()
   {
//      private int testInt;// don't work
//      public int testInt2;// don't work
      final int testInt3; //work
   }
   abstract void teste();
}
