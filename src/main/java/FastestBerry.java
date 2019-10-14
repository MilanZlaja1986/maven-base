import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FastestBerry {

	public static void main(String[] args) throws IOException {

		List<FinalBarry> listOfBerries = new ArrayList<>();

		for (int i = 1; i < FinalApi.numberOfBerry(); i++) {
			listOfBerries.add(
					new FinalBarry(FinalApi.nameOfBerry(i), FinalApi.sizeOfBerry(i), FinalApi.growthTimeOfBerry(i)));
		}

		System.out.println(fastetsBerry(listOfBerries));
	}

	public static String fastetsBerry(List<FinalBarry> listOfBerries) {
		Collections.sort(listOfBerries, Comparator.comparing(FinalBarry::getGrowthTimeOfBerry).reversed()
				.thenComparing(FinalBarry::getSizeOfBerry));
		FinalBarry Big = listOfBerries.get(listOfBerries.size() - 1);
		return "Biggest and fastest growing berry is:\n" + Big.getNameOfBerry() + " (size: " + Big.getSizeOfBerry()
				+ ", growth time: " + Big.getGrowthTimeOfBerry() + ").";
	}

}
