package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

@GetMapping("/")
    public String skillsTracker () {
        return "<html>" +
                "<h1>" +
                "Skills Tracker" +
                "</h1>" +
                "<h2>" +
                "We have a few skills we would like to learn. Here is the list!" +
                "</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</html>";
    }
@GetMapping("form")
    public String results()  {
        return "<html>" +
                "<form action='results'>" +
                "<label for=\"language-select\">Name:</label>\n" +
                "<input type='text' name='name' id=\"name\">" +
                "<label for=\"language-select\">Choose a language:</label>\n" +
                "\n" +
                    "<select name='firstLanguage' id='fav-lang'>\n" +
                    "    <option value=\"\">--My First Favorite Language--</option>\n" +
                    "    <option value='java'>Java</option>\n" +
                    "    <option value='javascript'>JavaScript</option>\n" +
                    "    <option value='python'>Python</option>\n" +
                    "</select>" +
                    "\n" +
                    "<select name='secondLanguage' id='second-fave'>\n" +
                    "    <option value=\"\">--My Second Favorite Language--</option>\n" +
                    "    <option value='java'>Java</option>\n" +
                    "    <option value='javascript'>JavaScript</option>\n" +
                    "    <option value='python'>Python</option>\n" +
                    "</select>" +
                    "\n" +
                    "<select name='thirdLanguage' id='third-fave'>\n" +
                    "    <option value=\"\">--My Third Favorite Language--</option>\n" +
                    "    <option value='java'>Java</option>\n" +
                    "    <option value='javascript'>JavaScript</option>\n" +
                    "    <option value='python'>Python</option>\n" +
                    "</select>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</html>";
    }
    @GetMapping("results")
    public String results(@RequestParam String name, String firstLanguage, String secondLanguage, String thirdLanguage){
        return "<html>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstLanguage + "</li>" +
                "<li>" + secondLanguage + "</li>" +
                "<li>" + thirdLanguage + "</li>" +
                "</ol>"+
                "<form action = '/'>" +
                "<input type='submit' value='Return Home'>" +
                "</form>"+
                "</html>";
    }

}
