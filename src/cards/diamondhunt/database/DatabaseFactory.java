package cards.diamondhunt.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cards.diamondhunt.card.Card;
import cards.diamondhunt.card.Rarity;

public class DatabaseFactory 
{
	
	private static DatabaseFactory factory = null;

	
	public static DatabaseFactory getInstance() 
	{
		if (factory == null)
			factory = new DatabaseFactory();

		return factory;
	}

	public ArrayList<Card> getAllCards()
	{
		ArrayList<Card> cards = new ArrayList<Card>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;

		try 
		{
			connection = DataSource.getInstance().getConnection();

			String query = "SELECT * from cards";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.execute();
			rs = preparedStatement.executeQuery();

			while (rs.next()) 
			{
				String name = rs.getString("cards_name");
				String rarity = rs.getString("cards_rarity");
				Card card = new Card(name, Rarity.valueOf(rarity));
				cards.add(card);
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();

				if (rs != null)
					rs.close();

				if (connection != null)
					connection.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return cards;
	}

}
