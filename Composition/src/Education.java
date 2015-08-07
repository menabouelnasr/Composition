
public class Education 
{
	public String schoolName;

	public String getSchoolName() 
	{
		if(schoolName.equalsIgnoreCase("y"))
		{
		return "The last 10 schools attended are:\n"
				+ "1. Tinc Road Elementary School\n"
				+ "2. Sandshore Road Elementary School\n"
				+ "3. Memorial Elementary School\n"
				+ "4. Mt. Tabor Elementary School\n"
				+ "5. Warren Hills Regional Middle School\n"
				+ "6. Warren Hills Regional High School\n"
				+ "7. Rutgers University School of Engineering\n"
				+ "8. Montgomery College\n"
				+ "9. Boston University\n"
				+ "10. John Hopkins University\n";
		}
		else
			return "You did not select to know the school names";
	}

	public void setSchoolName(String schoolName) 
	{
		this.schoolName = schoolName;
	}
	 @Override
	    public String toString() 
	    {
	    	return getSchoolName();
	    }
	
}
