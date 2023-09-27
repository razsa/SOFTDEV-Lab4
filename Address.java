// generic class to be used where an address is needed for data records

public class Address
{
	private String _city;
	private String _state;
	private int _zip;
	// **** Expand here to include street name, street number, apartment number
	private String _streetName;
	private int _streetNumber;
	private int _apartmentNumber;
	
	// **** change default construtor to include new private instance variables (attributes)
	public Address( String city, String state, int zip, String streetName, int streetNumber, int apartmentNumber )
	{
		// build filtering for city, state, street name, street number, apartment numbers
		setCity( city );
		setState( state );
		setZip( zip );
		setStreetName( streetName );
		setStreetNumber( streetNumber );
		setApartmentNumber( apartmentNumber );
	}
private void setCity(String city) {
    if (city.matches("^[A-Za-z\\s\\-]+$")) {
        _city = city;
    } else {
        throw new IllegalArgumentException("Invalid City Format");
    }
}

public void setState(String state) {
    if (state.matches("^[A-Z]{2}$")) {
        _state = state;
    } else {
        throw new IllegalArgumentException("Invalid State Format");
    }
}

public void setStreetName(String streetName) {
    if (streetName.matches("^[A-Za-z\\s\\-0-9]+$")) {
        _streetName = streetName;
    } else {
        throw new IllegalArgumentException("Invalid Street Name Format");
    }
}

public void setStreetNumber(int streetNumber) {
    if (String.valueOf(streetNumber).matches("^[1-9][0-9]*$")) {
        _streetNumber = streetNumber;
    } else {
        throw new IllegalArgumentException("Invalid Street Number Format");
    }
}

public void setApartmentNumber(int apartmentNumber) {
    if (String.valueOf(apartmentNumber).matches("^\\d+$")) {
        _apartmentNumber = apartmentNumber;
    } else {
        throw new IllegalArgumentException("Invalid Apartment Number Format");
    }
}

	{
		// build filtering for city, state, street name
		setCity( city );
		setState( state );
		setZip( zip );
	}

	private void setCity(String city) {
		if (city.matches("^[A-Za-z\\s\\-]+$")) {
			_city = city;
		} else {
			throw new IllegalArgumentException("Invalid City Format");
		}
	}
	
	private void setState(String state) {
		if (state.matches("^[A-Z]{2}$")) {
			_state = state;
		} else {
			throw new IllegalArgumentException("Invalid State Format");
		}
	}
	
	private void setStreetName(String streetName) {
		if (streetName.matches("^[A-Za-z\\s\\-0-9]+$")) {
			_streetName = streetName;
		} else {
			throw new IllegalArgumentException("Invalid Street Name Format");
		}
	}
	
	// **** create setters and getters for  street name, street number, apartment number
    final void setCity( String city )
	{
		_city = city;
	}
	public String getCity( )
	{
		return _city;
	}
	final void setState( String state )
	{
		_state = state;
	}
	public String getState( )
	{
		return _state;
	}
	final void setZip( int zip )
	{
		_zip = zip;
	}
	public int getZip( )
	{
		return _zip;
	}
	public String getStreetName( )
	{
		return _streetName;
	}
	final void setStreetName( String streetName )
	{
		_streetName = streetName;
	}
	public int getStreetNumber( )
	{
		return _streetNumber;
	}
	final void setStreetNumber( int streetNumber )
	{
		_streetNumber = streetNumber;
	}
	public int getApartmentNumber( )
	{
		return _apartmentNumber;
	}
	public void setApartmentNumber( int apartmentNumber )
	{
		_apartmentNumber = apartmentNumber;
	}
}