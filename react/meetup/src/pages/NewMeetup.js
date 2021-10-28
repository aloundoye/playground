import NewMeetupForm from "../components/meetups/NewMeetupForm";
import { useHistory } from "react-router-dom";

function NewMeetupPage(props) {
  const history = useHistory();

  function AddMeetupHandler(meetupData) {
    fetch(
      "https://react-meetup-7bb76-default-rtdb.firebaseio.com/meetups.json",
      {
        method: "POST",
        body: JSON.stringify(meetupData),
        headers: { "Content-Type": "application/json" },
      }
    ).then(() => {
      history.replace("/");
    });
  }

  return (
    <section>
      <h1>Add New Meetup</h1>
      <NewMeetupForm AddMeetup={AddMeetupHandler} />
    </section>
  );
}

export default NewMeetupPage;
