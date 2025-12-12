	package javaMethodOverriding;

public class Sports {
	String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers1(){
        System.out.println( "Each team has n players in " + getName() );
    }
  static class Soccer extends Sports{
        @Override
        String getName(){
            return "Soccer Class";
        }
    }
  void getNumberOfTeamMembers(){
              System.out.println( "Each team has 11 players in " + getName() );  
      }

}