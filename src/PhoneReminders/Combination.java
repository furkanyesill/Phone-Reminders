package veriYapilari;

public class Combination {
	/**
	 * Sonuçları hesaplayıp ekrana basan fonksiyon.
	 * @param base Başlangıç string'i. Her yeniden çağırmada üzerine eklemeler yapılır.
	 * @param iter root'tan başlayarak sona kadarki iterasyon değeri.
	 */
	public void combinate(String base, Node iter)
	{
		if (iter == null){
			System.out.println(base);
	        return;
	    }
		
	    char[] letters = iter.data.toCharArray();
	    for (int i = 0 ; i < letters.length ; i++)
	        combinate(base + letters[i], iter.next);
	}
}
