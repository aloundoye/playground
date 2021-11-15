import NewMeetupForm from "../../components/meetups/NewMeetupForm.js";
import { useRouter } from "next/router";

function NewMeetupPage() {
  const router = useRouter();

  //Send data to the API
  async function addMeetupHandler(enteredMeetupData) {
    const response = await fetch("/api/new-meetup", {
      method: "POST",
      body: JSON.stringify(enteredMeetupData),
      headers: { "Content-Type": "application/json" },
    });

    const data = await response.json();
    console.log(data);

    router.push("/");
  }

  return <NewMeetupForm onAddMeetup={addMeetupHandler} />;
}

export default NewMeetupPage;
