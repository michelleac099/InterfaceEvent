public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0)
      {
         return sum / objects.length;
      }
      else
      {
         return 0;
      }
   }

   /**
      Computes the maximum of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the maximum of the measures, null if array is empty
   */
   public static double max(Measurable[] objects)
   {
      double max = 0;
	   if (objects.length == 0)
      {
         return 0;
      }
      max = objects[0].getMeasure();
      for (Measurable obj : objects)
      {
         if (obj.getMeasure() > max)
         {
            max = obj.getMeasure();
         }
      }

      return max;
   }
   public static double min(Measurable[] objects)
   {
      double min = 0;
	   if (objects.length == 0)
      {
         return 0;
      }
      min = objects[0].getMeasure();
      for (Measurable obj : objects)
      {
         if (obj.getMeasure() < min)
         {
            min = obj.getMeasure();
         }
      }

      return min;
   }
   
}
