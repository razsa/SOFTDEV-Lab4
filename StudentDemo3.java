import java.util.ArrayList;

public class StudentDemo3
{
    public static void main( String[] args )
    {
        ArrayList<Student> students = new ArrayList<>( );
        StringBuilder studentOutput = new StringBuilder( "" );

       // **** use the  setStartingID() method in 'StudentIdGenerator' Singleton class to start at 500
        StudentIdGenerator.setStartingID( 500 );
      
        students.add( new UndergraduateStudent( "Harry Muggle", "Potter", StudentClassification.FRESHMAN, 
            new Address( "Atlanta", "Georgia", 30305) ));
        students.add( new UndergraduateStudent( "Diana-Wonder-Woman", "Prince", StudentClassification.JUNIOR,
            new Address( "Washington D.C.", "District of Columbia", 30318) ));
	
        // **** add two GraduateStudent objects to the 'students' collection (ArrayList)
        students.add( new GraduateStudent( "Bruce", "Wayne", StudentClassification.SENIOR,
            new Address( "Gotham City", "New Jersey", 30318) ));
        students.add( new GraduateStudent( "Clark", "Kent", StudentClassification.SENIOR,
            new Address( "Metropolis", "New York", 30318) ));
        for (Student S : students)
        {
            studentOutput.append( "\n-----------------------------\n" + S.toString( ) );
            if( S instanceof UndergraduateStudent )
            {
                studentOutput.append( "\nUndergraduate student of status: " ).append( S.getClassification( ).toString( ) );
            }
            else if ( S instanceof GraduateStudent )
            {
                studentOutput.append( "\nGraduate student of status: " ).append( S.getClassification( ).toString( ) );
            }
            System.out.println( studentOutput.toString( ) + "\n" );
            studentOutput.setLength( 0 );
        }
	
                    
		
    }
}
