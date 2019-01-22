class testi{
    public testi(){};
    public boolean waitwhat(){
        return true;
    }
}

class testingsublime{
	public static void main(String[] args){
		System.out.println("yaya it worked");
        testi te = new testi();
        if(te.waitwhat()){
            System.out.println("oh okay");
        }
	}
}

