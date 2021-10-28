import NewMeetupForm from "../components/meetups/NewMeetupForm";

function NewMeetupPage(props) {
  function AddMeetupHandler(meetupData) {
    fetch(
      "https://react-meetup-7bb76-default-rtdb.firebaseio.com/meetups.json",
      {
        method: "POST",
        body: JSON.stringify(meetupData),
        headers: { "Content-Type": "application/json" },
      }
    );
  }

  return (
    <section>
      <h1>Add New Meetup</h1>
      <NewMeetupForm AddMeetup={AddMeetupHandler} />
    </section>
  );
}

export default NewMeetupPage;
