

public class Agent{
    private int agentId;
    private String firstName;
    private String lastName;
    private String city;
    private double premium;
    public Agent(){

    }
    public Agent(int argAgentId,String argFirstName,String argLastName,String argCity,double argPremium){
        this.agentId = argAgentId;
        this.firstName = argFirstName;
        this.lastName = argLastName;
        this.city = argCity;
        this.premium = argPremium;
    }
    public int getAgentId()
    {
        return agentId;
    }
    public void setAgentId(int argAgentId){
        this.agentId = argAgentId;
    }
    public String getFir stName(){
        return firstName;
    }
    public void setFirstName(String argFirstName){
        this.firstName = argFirstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String argLastName){
        this.lastName = argLastName;
    }
    public String getCity(){
        return city;
    }
    public void  setCity(String argCity){
        this.city = argCity;
    }
    public double getPremium(){
        return premium;
    }
    public void setPremium(double argPremium){
        this.premium = argPremium;
    }
    @Override
    public final String toString(){
        return "AgentId:" +agentId+ "\nFirstname:" +firstName+ "\nLastname:" +lastName + "\nCity:"+city +"\nPremium:"+premium;
    }
    public static void main(String[] args) {
        Agent ag=new Agent(1,"Karthiga","Pitchiah","Rajapalayam",654445);
        System.out.println(ag);
        Agent agt=new Agent();
        agt.setAgentId(87);
        agt.setFirstName("Raji");
        agt.setLastName("Lakshmi");
        agt.setCity("Pune");
        agt.setPremium(654654);
        System.out.println(agt);
    }
}