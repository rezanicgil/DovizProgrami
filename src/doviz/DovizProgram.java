package doviz;

public class DovizProgram {
	
	
	public static void main(String[] args)
	{
		DovizView view = new DovizView();
		view.setVisible(true);
		DovizModel model = new DovizModel();
		DovizController control = new DovizController(view,model);
		
		model.getDovizData();
		model.dovizHesapla();
	}

}