var attempt = new Array("0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0");
var last_value= new Array("0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0");
function ans(question, answer){
  if (attempt[question] >= "3") {
    return true;
  }
  if (attempt[question] == answer)  {
    return true;
  }
  if (answer == "correct") {
    answer_to_show="correct"+question;
    showAns(question, answer_to_show);
    last_value[question]=answer;
    attempt[question] = 4;
  }
  if (answer == "wrong") {
    if (attempt[question] == "0") {
      answer_to_show="wrong"+question;
      showAns(question, answer_to_show);
      last_value[question]=answer;
      attempt[question]++;
      return true;
    }
    if (attempt[question] == "1") {
      answer_to_show="wrong"+question+"e";
      showAns(question, answer_to_show);
      last_value[question]=answer;
      attempt[question]++;
      return true;
    }
    if (attempt[question] == "2") {
      answer_to_show="wrong"+question+"a";
      showAns(question, answer_to_show);
      last_value[question]=answer;
      attempt[question]++;
      return true;
    }
    if (attempt[question] >= "3") {
      answer_to_show="wrong"+question+"a";
      showAns(question, answer_to_show);
      last_value[question]=answer;
      attempt[question] = 4;
      return true;
    }
  }
}
function showAns(question, answer_to_show)	{
  answer_to_hide1="correct"+question;
  answer_to_hide2="wrong"+question;
  answer_to_hide2e="wrong"+question+"e";
  answer_to_hide3="wrong"+question+"a";
  hide_answer1=document.getElementById(answer_to_hide1);
  hide_answer2=document.getElementById(answer_to_hide2);
  hide_answer2e=document.getElementById(answer_to_hide2e);
  hide_answer3=document.getElementById(answer_to_hide3);
  hide_answer1.style.display="none";
  hide_answer2.style.display="none";
  hide_answer2e.style.display="none";
  hide_answer3.style.display="none";
  show_answer=document.getElementById(answer_to_show);
  show_answer.style.display="block";
}
