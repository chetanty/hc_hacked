package com.example.hc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Page3 extends AppCompatActivity {

    private TextView chatbotResponseTextView;
    private EditText userInputEditText;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        // Initialize UI elements
        chatbotResponseTextView = findViewById(R.id.chatbotResponseTextView);
        userInputEditText = findViewById(R.id.userInputEditText);
        sendButton = findViewById(R.id.sendButton);

        // Set up the button click listener
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = userInputEditText.getText().toString();
                String response = getResponse(userInput);
                chatbotResponseTextView.setText(response);
                userInputEditText.setText(""); // Clear the input field
            }
        });
    }

    private String getResponse(String input) {
        input = input.toLowerCase();
        StringBuilder responseBuilder = new StringBuilder();

        if (input.contains("food") || input.contains("bank") || input.contains("eat")) {
            responseBuilder.append(getFoodBankInfo()).append("\n\n");
        }
        if (input.contains("shelter") || input.contains("home") || input.contains("live")) {
            responseBuilder.append(getShelterInfo()).append("\n\n");
        }
        if (input.contains("cloth") || input.contains("jacket") || input.contains("shirt")) {
            responseBuilder.append(getClothingResourcesInfo()).append("\n\n");
        }
        if (input.contains("job") || input.contains("employ") || input.contains("youth") || input.contains("work") || input.contains("hire")) {
            responseBuilder.append(getJobYouthWorkInfo()).append("\n\n");
        }

        if (responseBuilder.length() == 0) {
            responseBuilder.append("Sorry, I'm not sure how to respond to that. Can you try again?");
        }

        return responseBuilder.toString();
    }



    private String getJobYouthWorkInfo() {
        return "Job and Youth Services in Edmonton:\n\n" +
                "1. WEAC\n" +
                "   Address: 9611 101A Ave, Edmonton, AB T5H 0C8\n" +
                "   Hours: Open 24 hours\n" +
                "   Phone: (780) 423-5302\n\n" +
                "2. Homeward Trust Edmonton\n" +
                "   Address: 10242 105 St NW, Edmonton, AB T5J 3L5\n" +
                "   Hours: Mon-Fri: 8:30 a.m.–4:30 p.m., Sat & Sun: Closed\n" +
                "   Phone: (780) 496-2630\n\n" +
                "3. Old Strathcona Youth Society\n" +
                "   Address: 10325 83 Ave NW, Edmonton, AB T6E 2C6\n" +
                "   Hours: Tue-Thu: 1–9 p.m., Fri-Sat: 2–6 p.m., Sun & Mon: Closed\n" +
                "   Phone: (780) 496-5947\n\n" +
                "4. Hope Mission\n" +
                "   Address: 9908 106 Ave NW, Edmonton, AB T5H 0N6\n" +
                "   Hours: Mon-Fri: 9 a.m.–5 p.m., Sat & Sun: Closed\n" +
                "   Phone: (780) 422-2018\n\n" +
                "5. YESS: Youth Empowerment & Support Services\n" +
                "   Address: 9310 82 Ave NW, Edmonton, AB T6C 0Z6\n" +
                "   Hours: 24/7, 7 days a week\n" +
                "   Phone: (780) 468-7070";
    }
    private String getClothingResourcesInfo() {
        return "Clothing Resources in Edmonton:\n\n" +
                "1. Suit Your Self\n" +
                "   Address: 9003 111 Ave NW, Edmonton, AB T5B 0C3\n" +
                "   Phone: (780) 488-9930\n\n" +
                "2. Society of Saint Vincent De Paul\n" +
                "   Address: 11531 120 St NW, Edmonton, AB T5G 2Y4\n" +
                "   Hours: Mon to Thu: 10 a.m.–12 p.m., Fri to Sun: Closed\n" +
                "   Phone: (780) 471-5577\n\n" +
                "3. The Mustard Seed Community Support Centre\n" +
                "   Address: 10568 114 St NW, Edmonton, AB T5H 3J7\n" +
                "   Hours: Mon to Fri: 8 a.m.–4:30 p.m., Sat & Sun: Closed\n" +
                "   Phone: +1 877-731-7333\n\n" +
                "4. Hope Mission\n" +
                "   Address: 9908 106 Ave NW, Edmonton, AB T5H 0N6\n" +
                "   Hours: Mon to Fri: 9 a.m.–5 p.m., Sat & Sun: Closed\n" +
                "   Phone: (780) 422-2018";
    }
    private String getShelterInfo() {
        return "Temporary Shelters in Edmonton:\n\n" +
                "1. Hope Mission Main Building\n" +
                "   Address: 9908 – 106 Avenue\n" +
                "   Phone: 780-422-2018\n\n" +
                "2. Herb Jamieson Centre\n" +
                "   Address: 10014 – 105A Avenue\n" +
                "   Phone: 780-422-2018\n\n" +
                "3. The Neighbour Centre\n" +
                "   Address: 10050 – 81 Avenue\n" +
                "   Phone: 780-619-9885\n\n" +
                "4. Women’s Emergency Accommodation Centre (WEAC)\n" +
                "   Address: 9611 – 101 A Avenue\n" +
                "   Phone: 780-423-5302\n\n" +
                "5. Nexus Overnight Shelter (Youth only ages 15-21)\n" +
                "   Address: 9310 – 82 Avenue\n" +
                "   Phone: 780-468-7070\n\n" +
                "For non-emergency social, health, and government services, or to check shelter capacity, call 211.\n\n" +
                "If you are experiencing homelessness, contact Coordinated Access for assistance:\n" +
                "   Email: coordinatedaccess@homewardtrust.ca\n" +
                "   Phone: 780-702-5267\n\n" +
                "Let’s help each other stay safe.";
    }
    private String getFoodBankInfo() {
        return "Food Banks Near You in Edmonton:\n\n" +
                "1. Edmonton's Food Bank\n" +
                "   Address: 11508 120 St NW, Edmonton, AB T5G 2Y2\n" +
                "   Hours: Mon-Fri: 8:30 a.m.–4:30 p.m., Sat & Sun: Closed\n" +
                "   Phone: (780) 425-2133\n\n" +
                "2. Campus Food Bank\n" +
                "   Address: University of Alberta, Students' Union Building, 114 St NW #1-81, Edmonton, AB T6G 2J7\n" +
                "   Hours: Mon: 4–8 p.m., Tue: 12–4 p.m., Wed: 8 a.m.–12 p.m., 4–8 p.m., Thu: 4–8 p.m., Fri: 12–4 p.m., Sat & Sun: Closed\n" +
                "   Phone: (780) 492-8677\n\n" +
                "3. NISO - Edmonton's Food Bank\n" +
                "   Address: 11448 120 ST NW, Edmonton, AB T5G 2Y2\n" +
                "   Hours: Currently open during depot hours: 10:00 - 11:00 am, and 2:00 - 3:00 pm\n\n" +
                "4. Main Warehouse Edmonton's Food Bank\n" +
                "   Address: 11508 120 ST NW, Edmonton, AB T5G 2Y2\n" +
                "   Hours: Mon-Sat: 8:30 a.m. to 4:30 p.m., Mon-Thu Evenings: 4:30 p.m. to 8:00 p.m. (Ring the black doorbell for access after 4:30 pm), Closed on long weekends and holidays.\n\n" +
                "5. Veterans Association Food Bank - Edmonton\n" +
                "   Address: 18504 111 Ave NW, Edmonton, AB T5S 2V4\n" +
                "   Hours: Mon-Sat: 8 a.m. – 4 p.m., Sun: Closed\n" +
                "   Phone: +1 833-422-8387 ext. 2";

    }
}
