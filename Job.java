/**
 * @author pranatishrivastava
 *  This bean class stores the name, priority and count of occurrence of jobs.
 *  The count variable is added to it, so that using this information first in 
 *  first out service could be implemented on elements with equal priorities.
 *  Thus, the priority queue could be stable.
 */


package finalpq;

public class Job {
	String job;
    int priority;
    int count; //info needed for stable priority queue
    public Job() {
		// TODO Auto-generated constructor stub
	}
    /** Constructor **/
    public Job(String job, int priority, int count)
    {
        this.job = job;
        this.priority = priority; 
        this.count= count;
    }
    /*public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}*/
	/** toString() **/
    public String toString() 
    {
        return "Job Name : "+ job +" Priority : "+ priority+"\n";
    }
}
