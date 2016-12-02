/** 
 COMP1006/1406 - Summer 2014
 Assignment 9, Problem 1
 
 names: Daihee Kim || Muhammad Mustafa || Stanley Mbah Mbanwi || Malik Ehsanullah
 IDs:   100896156  || 100823576        || 100949700           || 100833433
 date: 08/11/2014
 
 Throws exception when an entity is out of bounds
 */

public class EntityOutOfBoundsException extends Exception
{
  public EntityOutOfBoundsException(String message)
  {
    super(message);
  }
}