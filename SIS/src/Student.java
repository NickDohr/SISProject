
public class Student
	{

		private String firstname;
		private String lastname;
		private double gpa;
		private String firstperiod;
		private String firstgrade;
		private String secondperiod;
		private String secondgrade;
		private String thirdperiod;
		private String thirdgrade;
		
		public Student(String fn, String ln, String fp, String sp, String tp, String fg, String sg, String tg)
		{
		
		firstname = fn;
		lastname = ln;
		firstperiod = fp;
		secondperiod = sp;
		thirdperiod = tp;
		firstgrade = fg;
		secondgrade = sg;
		thirdgrade = tg;
			
		}

		public String getFirstname()
			{
				return firstname;
			}

		public void setFirstname(String firstname)
			{
				this.firstname = firstname;
			}

		public String getLastname()
			{
				return lastname;
			}

		public void setLastname(String lastname)
			{
				this.lastname = lastname;
			}

		public double getGpa()
			{
				return gpa;
			}

		public void setGpa(double gpa)
			{
				this.gpa = gpa;
			}

		public String getFirstperiod()
			{
				return firstperiod;
			}

		public void setFirstperiod(String firstperiod)
			{
				this.firstperiod = firstperiod;
			}

		public String getSecondperiod()
			{
				return secondperiod;
			}

		public void setSecondperiod(String secondperiod)
			{
				this.secondperiod = secondperiod;
			}

		public String getThirdperiod()
			{
				return thirdperiod;
			}

		public void setThirdperiod(String thirdperiod)
			{
				this.thirdperiod = thirdperiod;
			}

		public String getFirstgrade()
			{
				return firstgrade;
			}

		public void setFirstgrade(String firstgrade)
			{
				this.firstgrade = firstgrade;
			}

		public String getSecondgrade()
			{
				return secondgrade;
			}

		public void setSecondgrade(String secondgrade)
			{
				this.secondgrade = secondgrade;
			}

		public String getThirdgrade()
			{
				return thirdgrade;
			}

		public void setThirdgrade(String thirdgrade)
			{
				this.thirdgrade = thirdgrade;
			}
		
		
		
	}
