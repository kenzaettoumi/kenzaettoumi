public class main {
	pblic static class Newuser
	{
		public string utilisateurname;
		public string et1;
		public string et2;
	    public string age;
		public string annéescolaire;
		public string filièreenbaccalauréat;
		public string email;
		public string phonenumber;

		public Newuser(string utilisateurname,string et1,string et2,string age,string annéescolaire,
		      string  filièreenbaccalauréat,string email,string phonenumber)
			  {
				  this.utilisateurname = utilisateurname;
				  this.et1 = et1;
				  this.et2 = et2;
			      this.age = age;
				  this.annéescolaire = annéescolaire;
				  this.filièreenbaccalauréat = filièreenbaccalauréat;
				  this.email = email;
				  this.phonenumber = phonenumber;
              }
                    public void setUtilisateurName(string utilisateurname)
					{
                       this.utilisateurname = utilisateurname;
                    }
					public void setET1(string et1)
					{
                       this.et1 = et1;
                    }
					public void setET2(string et2)
					{
                       this.et2 = et2;
                    }
	                 public void setAge(string age)
					{
                       this.age = age;
                    }
                      public void setAnnéeScolaire(string annéescolaire)
					{
                       this.annéescolaire = annéescolaire;
                    }
			          public void setFilièreEnBaccalauréat(string filièreenbaccalauréat)
					{
                       this.filièreenbaccalauréat = filièreenbaccalauréat;
                    }
	                  public void setEmail(string email)
					{
                       this.email= email;
                    }
					  public void setPhoneNumber(string phonenumber)
					{
                       this.phonenumber = phonenumber;
                    }
					 public boolean passCheck(String et1, String et2)
        {
            if (et1.equals(et2))
                return true;
            else
                return false;
        }

        public void UserIDLength (String userid)
        {
            System.out.println ("Your user ID is " + userid.length());
        }
        public boolean stringCheck (String utilisateurname, String et1, String et2, String age, String annéescolaire, String filièreenbaccalauréat,
		String email, String phonenumber)
        {
            if (utilisateurname.length()==0)
                return false;
            else if (et1.length()==0)
                return false;
            else if (age.length()==0)
                return false;
            else if (annéescolaire.length()==0)
                return false;
            else if (filièreenbaccalauréat.length()==0)
                return false;
            else if (email.length()==0)
                return false;
            else if (phonenumber.length()==0)
                return false;
            else
                return true;

        public boolean emailCheck(String email)
        {
            int a = email.indexOf('@');
            int b = email.indexOf('.');
            if (a > -1)
                return true;
            if (b > -1)
                return true;
            if (a<b)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
	// write your code here

    }
}