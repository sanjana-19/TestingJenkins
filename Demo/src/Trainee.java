import java.util.HashMap;

public class Trainee {
		static	HashMap<Integer,String> emps=new HashMap<Integer,String>();
		public static int addTrainee(int tId ,String tName)
		{
			emps.put(tId,tName);
		    return	emps.size();
		}
		public static String  updateTrainee(int tId ,String tName)
		{
			return emps.put(tId,tName);
		}
		public static int removeTrainee(int tId)
		{
			emps.remove(tId);
		    return	emps.size();
		}
		public static String  fetchTrainee(int tId)
		{
			return emps.get(tId);
		}
		public static int fetchAllTrainee()
		{
			return emps.size();
		}

}
