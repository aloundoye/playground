import MeetupList from "../components/meetups/MeetupList";
import { useEffect, useState } from "react";

function AllMeetupsPage() {
  const [isloading, setIsLoading] = useState(true);
  const [loadedMeetups, setLoadedMeetups] = useState([]);

  useEffect(() => {
    setIsLoading(true);
    fetch("https://react-meetup-7bb76-default-rtdb.firebaseio.com/meetups.json")
      .then((response) => {
        return response.json();
      })
      .then((data) => {
        const meetups = [];
        for (const key in data) {
          const meetup = {
            id: key,
            ...data[key],
          };
          meetups.push(meetup);
        }
        setIsLoading(false);
        setLoadedMeetups(meetups);
      });

    if (isloading) {
      return (
        <section>
          <h1>Loading...</h1>
        </section>
      );
    }
  }, []);

  return (
    <section>
      <h1>All meetup page</h1>
      <MeetupList meetups={loadedMeetups} />
    </section>
  );
}

export default AllMeetupsPage;
