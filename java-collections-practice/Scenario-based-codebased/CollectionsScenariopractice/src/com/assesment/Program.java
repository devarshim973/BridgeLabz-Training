package com.assesment;

import java.util.*;

class CreatorStats {
	private String creatorName;
	private double[] weeklyLikes;

	public static List<CreatorStats> engagementBoard = new ArrayList<>();

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public double[] getWeeklyLikes() {
		return weeklyLikes;
	}

	public void setWeeklyLikes(double[] weeklyLikes) {
		this.weeklyLikes = weeklyLikes;
	}
}

public class Program {

	public void registerCreator(CreatorStats record) {
		CreatorStats.engagementBoard.add(record);
	}

	public Map<String, Integer> getTopPostCounts(List<CreatorStats> records, double threshold) {
		Map<String, Integer> result = new LinkedHashMap<>();

		for (CreatorStats creator : records) {
			int count = 0;
			for (double like : creator.getWeeklyLikes()) {
				if (like >= threshold) {
					count++;
				}
			}
			if (count > 0) {
				result.put(creator.getCreatorName(), count);
			}
		}
		return result;
	}

	public double calculateAverageLikes() {
		double total = 0;
		int count = 0;

		for (CreatorStats creator : CreatorStats.engagementBoard) {
			for (double like : creator.getWeeklyLikes()) {
				total += like;
				count++;
			}
		}

		if (count == 0)
			return 0;

		return total / count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Program obj = new Program();
		int choice = 0;

		while (choice != 4) {

			System.out.println("1. Register Creator");
			System.out.println("2. Show Top Posts");
			System.out.println("3. Calculate Average Likes");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");

			choice = Integer.parseInt(sc.nextLine());

			if (choice == 1) {

				System.out.println("Enter Creator Name:");
				String name = sc.nextLine();

				System.out.println("Enter weekly likes (Week 1 to 4):");

				double[] likes = new double[4];
				for (int i = 0; i < 4; i++) {
					likes[i] = Double.parseDouble(sc.nextLine());
				}

				CreatorStats creator = new CreatorStats();
				creator.setCreatorName(name);
				creator.setWeeklyLikes(likes);

				obj.registerCreator(creator);
				System.out.println("Creator registered successfully");
			}

			else if (choice == 2) {

				System.out.println("Enter like threshold:");
				double threshold = Double.parseDouble(sc.nextLine());

				Map<String, Integer> result = obj.getTopPostCounts(CreatorStats.engagementBoard, threshold);

				if (result.isEmpty()) {
					System.out.println("No top-performing posts this week");
				} else {
					for (Map.Entry<String, Integer> entry : result.entrySet()) {
						System.out.println(entry.getKey() + " - " + entry.getValue());
					}
				}
			}

			else if (choice == 3) {

				double avg = obj.calculateAverageLikes();

				if (avg == (long) avg) {
					System.out.println("Overall average weekly likes: " + (long) avg);
				} else {
					System.out.println("Overall average weekly likes: " + avg);
				}
			}

			else if (choice == 4) {
				System.out.println("Logging off - Keep Creating with StreamBuzz!");
			}
		}

		sc.close();
	}
}
