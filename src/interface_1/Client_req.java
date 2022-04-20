package interface_1;

public interface Client_req {

	public void webdesign();
	public void webdevelopment();
	public void webtesting();
	public void webmaintanace();
     private void one() {
    	 System.out.println(" a");
     }
     default void second() {
    	 one();
     }
     int a=10;
}
