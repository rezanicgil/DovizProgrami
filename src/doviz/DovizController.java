package doviz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DovizController {
	DovizView view = new DovizView();
	DovizModel model = new DovizModel();
	DovizController(DovizView view,DovizModel model)
	{
		this.view = view;
		this.model = model;
		
		this.view.cevirComboListener(new CevirBtnListener());
		
	}
	class CevirBtnListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(view.comboCevirilecek.getSelectedItem() == "Turk Lirasi"){
				
					if(view.comboCevirilmekIstenen.getSelectedItem() == "ABD Dolari")
					{
						Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
						Float sonucFloat = cevirilecekMiktar/(model.amerikanDolari);
						String sonuc = String.format("%.3f",sonucFloat );
						view.sonucText.setText(sonuc + "$");
						
					}
					else if(view.comboCevirilmekIstenen.getSelectedItem() == "Turk Lirasi")
					{
						view.sonucText.setText(view.cevirilmekIstenenGir.getText() + "TL");
					}
					else if(view.comboCevirilmekIstenen.getSelectedItem() == "Euro")
					{
						Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
						Float sonucFloat = cevirilecekMiktar/(model.euro);
						String sonuc = String.format("%.3f",sonucFloat );
						view.sonucText.setText(sonuc + "€");
					}	else if(view.comboCevirilmekIstenen.getSelectedItem() == "Ingiliz Sterlini")
					{
						Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
						Float sonucFloat = cevirilecekMiktar/(model.sterlin);
						String sonuc = String.format("%.3f",sonucFloat );
						view.sonucText.setText(sonuc + "£");
					}else if(view.comboCevirilmekIstenen.getSelectedItem() == "Kanada Dolari")
					{
						Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
						Float sonucFloat = cevirilecekMiktar/(model.kanadaDolar);
						String sonuc = String.format("%.3f",sonucFloat );
						view.sonucText.setText(sonuc + "C$");
					}else if(view.comboCevirilmekIstenen.getSelectedItem() == "Isvicre Frangi")
					{
						Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
						Float sonucFloat = cevirilecekMiktar/(model.frank);
						String sonuc = String.format("%.3f",sonucFloat );
						view.sonucText.setText(sonuc + "CHF");
					}else if(view.comboCevirilmekIstenen.getSelectedItem() == "100 Japon Yeni")
					{
						Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
						Float sonucFloat = cevirilecekMiktar/(model.japonYeni);
						String sonuc = String.format("%.3f",sonucFloat );
						view.sonucText.setText(sonuc + "JPY");
					}
					
					
					
				}
			if(view.comboCevirilecek.getSelectedItem() == "ABD Dolari"){
				
				if(view.comboCevirilmekIstenen.getSelectedItem() == "ABD Dolari")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.amerikanDolari)/(model.amerikanDolari));
					String sonuc = String.format("%.1f",sonucFloat );
					view.sonucText.setText(sonuc + "$");
					
				}
				else if(view.comboCevirilmekIstenen.getSelectedItem() == "Turk Lirasi")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.amerikanDolari));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "TL");
				}
				else if(view.comboCevirilmekIstenen.getSelectedItem() == "Euro")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.amerikanDolari)/(model.euro));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "€");
				}	else if(view.comboCevirilmekIstenen.getSelectedItem() == "Ingiliz Sterlini")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.amerikanDolari)/(model.sterlin));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "£");
				}else if(view.comboCevirilmekIstenen.getSelectedItem() == "Kanada Dolari")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.amerikanDolari)/(model.kanadaDolar));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "C$");
				}else if(view.comboCevirilmekIstenen.getSelectedItem() == "Isvicre Frangi")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.amerikanDolari)/(model.frank));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "CHF");
				}else if(view.comboCevirilmekIstenen.getSelectedItem() == "100 Japon Yeni")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.amerikanDolari)/(model.japonYeni));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "JPY");
				}
				
				
				
			}
			
			if(view.comboCevirilecek.getSelectedItem() == "Kanada Dolari"){
				
				if(view.comboCevirilmekIstenen.getSelectedItem() == "ABD Dolari")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.kanadaDolar)/(model.amerikanDolari));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "$");
					
				}
				else if(view.comboCevirilmekIstenen.getSelectedItem() == "Turk Lirasi")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.kanadaDolar));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "TL");
				}
				else if(view.comboCevirilmekIstenen.getSelectedItem() == "Euro")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.kanadaDolar)/(model.euro));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "€");
				}	else if(view.comboCevirilmekIstenen.getSelectedItem() == "Ingiliz Sterlini")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.kanadaDolar)/(model.sterlin));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "£");
				}else if(view.comboCevirilmekIstenen.getSelectedItem() == "Kanada Dolari")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.kanadaDolar)/(model.kanadaDolar));
					String sonuc = String.format("%.1f",sonucFloat );
					view.sonucText.setText(sonuc + "C$");
				}else if(view.comboCevirilmekIstenen.getSelectedItem() == "Isvicre Frangi")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.kanadaDolar)/(model.frank));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "CHF");
				}else if(view.comboCevirilmekIstenen.getSelectedItem() == "100 Japon Yeni")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.kanadaDolar)/(model.japonYeni));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "JPY");
				}
				
				
				
			}
			if(view.comboCevirilecek.getSelectedItem() == "Isvicre Frangi"){
				
				if(view.comboCevirilmekIstenen.getSelectedItem() == "ABD Dolari")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.frank)/(model.amerikanDolari));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "$");
					
				}
				else if(view.comboCevirilmekIstenen.getSelectedItem() == "Turk Lirasi")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.frank));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "TL");
				}
				else if(view.comboCevirilmekIstenen.getSelectedItem() == "Euro")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.frank)/(model.euro));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "€");
				}	else if(view.comboCevirilmekIstenen.getSelectedItem() == "Ingiliz Sterlini")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.frank)/(model.sterlin));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "£");
				}else if(view.comboCevirilmekIstenen.getSelectedItem() == "Kanada Dolari")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.frank)/(model.kanadaDolar));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "C$");
				}else if(view.comboCevirilmekIstenen.getSelectedItem() == "Isvicre Frangi")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.frank)/(model.frank));
					String sonuc = String.format("%.1f",sonucFloat );
					view.sonucText.setText(sonuc + "CHF");
				}else if(view.comboCevirilmekIstenen.getSelectedItem() == "100 Japon Yeni")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.frank)/(model.japonYeni));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "JPY");
				}
			
		}
		if(view.comboCevirilecek.getSelectedItem() == "Euro"){
				
				if(view.comboCevirilmekIstenen.getSelectedItem() == "ABD Dolari")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.euro)/(model.amerikanDolari));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "$");
					
				}
				else if(view.comboCevirilmekIstenen.getSelectedItem() == "Turk Lirasi")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.euro));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "TL");
				}
				else if(view.comboCevirilmekIstenen.getSelectedItem() == "Euro")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.euro)/(model.euro));
					String sonuc = String.format("%.1f",sonucFloat );
					view.sonucText.setText(sonuc + "€");
				}	else if(view.comboCevirilmekIstenen.getSelectedItem() == "Ingiliz Sterlini")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.euro)/(model.sterlin));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "£");
				}else if(view.comboCevirilmekIstenen.getSelectedItem() == "Kanada Dolari")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.euro)/(model.kanadaDolar));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "C$");
				}else if(view.comboCevirilmekIstenen.getSelectedItem() == "Isvicre Frangi")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.euro)/(model.frank));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "CHF");
				}else if(view.comboCevirilmekIstenen.getSelectedItem() == "100 Japon Yeni")
				{
					Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
					Float sonucFloat = cevirilecekMiktar*((model.euro)/(model.japonYeni));
					String sonuc = String.format("%.3f",sonucFloat );
					view.sonucText.setText(sonuc + "JPY");
				}
			
		}
		if(view.comboCevirilecek.getSelectedItem() == "Ingiliz Sterlini"){
			
			if(view.comboCevirilmekIstenen.getSelectedItem() == "ABD Dolari")
			{
				Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
				Float sonucFloat = cevirilecekMiktar*((model.sterlin)/(model.amerikanDolari));
				String sonuc = String.format("%.3f",sonucFloat );
				view.sonucText.setText(sonuc + "$");
				
			}
			else if(view.comboCevirilmekIstenen.getSelectedItem() == "Turk Lirasi")
			{
				Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
				Float sonucFloat = cevirilecekMiktar*((model.sterlin));
				String sonuc = String.format("%.3f",sonucFloat );
				view.sonucText.setText(sonuc + "TL");
			}
			else if(view.comboCevirilmekIstenen.getSelectedItem() == "Euro")
			{
				Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
				Float sonucFloat = cevirilecekMiktar*((model.sterlin)/(model.euro));
				String sonuc = String.format("%.3f",sonucFloat );
				view.sonucText.setText(sonuc + "€");
			}	else if(view.comboCevirilmekIstenen.getSelectedItem() == "Ingiliz Sterlini")
			{
				Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
				Float sonucFloat = cevirilecekMiktar*((model.sterlin)/(model.sterlin));
				String sonuc = String.format("%.1f",sonucFloat );
				view.sonucText.setText(sonuc + "£");
			}else if(view.comboCevirilmekIstenen.getSelectedItem() == "Kanada Dolari")
			{
				Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
				Float sonucFloat = cevirilecekMiktar*((model.sterlin)/(model.kanadaDolar));
				String sonuc = String.format("%.3f",sonucFloat );
				view.sonucText.setText(sonuc + "C$");
			}else if(view.comboCevirilmekIstenen.getSelectedItem() == "Isvicre Frangi")
			{
				Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
				Float sonucFloat = cevirilecekMiktar*((model.sterlin)/(model.frank));
				String sonuc = String.format("%.3f",sonucFloat );
				view.sonucText.setText(sonuc + "CHF");
			}else if(view.comboCevirilmekIstenen.getSelectedItem() == "100 Japon Yeni")
			{
				Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
				Float sonucFloat = cevirilecekMiktar*((model.sterlin)/(model.japonYeni));
				String sonuc = String.format("%.3f",sonucFloat );
				view.sonucText.setText(sonuc + "JPY");
			}
		
	}
if(view.comboCevirilecek.getSelectedItem() == "100 Japon Yeni"){
			
			if(view.comboCevirilmekIstenen.getSelectedItem() == "ABD Dolari")
			{
				Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
				Float sonucFloat = cevirilecekMiktar*((model.japonYeni)/(model.amerikanDolari));
				String sonuc = String.format("%.3f",sonucFloat );
				view.sonucText.setText(sonuc + "$");
				
			}
			else if(view.comboCevirilmekIstenen.getSelectedItem() == "Turk Lirasi")
			{
				Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
				Float sonucFloat = cevirilecekMiktar*((model.japonYeni));
				String sonuc = String.format("%.3f",sonucFloat );
				view.sonucText.setText(sonuc + "TL");
			}
			else if(view.comboCevirilmekIstenen.getSelectedItem() == "Euro")
			{
				Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
				Float sonucFloat = cevirilecekMiktar*((model.japonYeni)/(model.euro));
				String sonuc = String.format("%.3f",sonucFloat );
				view.sonucText.setText(sonuc + "€");
			}	else if(view.comboCevirilmekIstenen.getSelectedItem() == "Ingiliz Sterlini")
			{
				Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
				Float sonucFloat = cevirilecekMiktar*((model.japonYeni)/(model.sterlin));
				String sonuc = String.format("%.3f",sonucFloat );
				view.sonucText.setText(sonuc + "£");
			}else if(view.comboCevirilmekIstenen.getSelectedItem() == "Kanada Dolari")
			{
				Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
				Float sonucFloat = cevirilecekMiktar*((model.japonYeni)/(model.kanadaDolar));
				String sonuc = String.format("%.3f",sonucFloat );
				view.sonucText.setText(sonuc + "C$");
			}else if(view.comboCevirilmekIstenen.getSelectedItem() == "Isvicre Frangi")
			{
				Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
				Float sonucFloat = cevirilecekMiktar*((model.japonYeni)/(model.frank));
				String sonuc = String.format("%.3f",sonucFloat );
				view.sonucText.setText(sonuc + "CHF");
			}else if(view.comboCevirilmekIstenen.getSelectedItem() == "100 Japon Yeni")
			{
				Float cevirilecekMiktar = Float.parseFloat(view.cevirilmekIstenenGir.getText());
				Float sonucFloat = cevirilecekMiktar*((model.japonYeni)/(model.japonYeni));
				String sonuc = String.format("%.1f",sonucFloat );
				view.sonucText.setText(sonuc + "JPY");
			}
		
	}
		
	}
	
	
	}
}

