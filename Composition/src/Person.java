public class Person 
{
    //composition has-a relationship
    private Job job;
    private Education edu;
    
    public Person()
    {
        this.job=new Job();
        job.setSalary(1000L);
        this.edu= new Education();
        edu.setSchoolName("y");
    }
    public long getSalary() 
    {
        return job.getSalary();
    }
    public String getSchoolName()
    {
    	return edu.getSchoolName();
    }
    @Override
    public String toString() 
    {
    	return edu.toString() + job.toString();

    }
}