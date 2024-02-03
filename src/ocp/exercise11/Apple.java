package ocp.exercise11;

import ocp.exercise11.food.Fruit;

class Apple extends Fruit
{
   private boolean wasEaten = false;

   @Override
   public void eat()
   {
      this.setWasEaten(true) ;
   }

   public boolean isWasEaten()
   {
      return wasEaten;
   }

   public void setWasEaten(boolean wasEaten)
   {
      this.wasEaten = wasEaten;
   }
   
}