
public abstract class Student 
{
    private long Id;
    private String _lastName, _firstName;
	protected Address _stuAddress = new Address( "","",0 );
	
    protected double tuition;
    protected StudentClassification eStudentClass; 

    public Student( String firstName, String lastName, StudentClassification eStudent, Address stuAddress )
    {
        setId( );
        if ( ( ( !firstName.equals( "" )) && ( firstName.matches( "^[-a-zA-Z\s]*$" ) ) ) )
        {
            setFirstName( firstName );
        }
        else
        {
            setFirstName( "INVALID FIRST NAME" );
        }
        // create filtering for firstName
        set();
        if ( ( ( !lastName.equals( "" )) && ( lastName.matches( "^[-a-zA-Z\s]*$" ) ) ) )
        {
            setLastName( lastName );
        }
        else
        {
            setLastName( "INVALID LAST NAME" );
        }
        
        setLastName( lastName );
        setClassifcation( eStudent );
        _stuAddress.setCity( stuAddress.getCity( ) );
        _stuAddress.setState( stuAddress.getState( ) );
        _stuAddress.setZip(  stuAddress.getZip( ) );
    }
    private void setId( )
    {
        Id = StudentIdGenerator.getNextId();
    }
    public long getId( )
    {
        return Id;
    }
    final void setLastName( String pName )
    {
        _lastName = pName;
    }
    public String getLastName( )
    {
        return _lastName;
    }
    final void setFirstName( String pName )
    {
        _firstName = pName;
    }
    public String getFirstName( )
    {
        return _firstName;
    }
    public double getTuition( )
    {
        return tuition;
    }
    final void setClassifcation( StudentClassification eStudent )
    {
        eStudentClass = eStudent;
    }
    public StudentClassification getClassification( )
    {
        return eStudentClass;
    }

	// no concrete code for abstract methods
    public abstract void setTuition( );

}
