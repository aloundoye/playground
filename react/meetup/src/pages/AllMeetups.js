import MeetupList from "../components/meetups/MeetupList";

const DUMMY_DATA = [
    {
        id: 'm1',
        title: 'This is a first meetup',
        image: '',
        address: 'Meetupstreet 5, 12345 Meetup City',
        description: 'This is a first meetup'
    },
    {
        id: 'm2',
        title: 'This is a second meetup',
        image: '',
        address: 'Meetupstreet 5, 12345 Meetup City',
        description: 'This is a second meetup'
    },
    {
        id: 'm3',
        title: 'This is a third meetup',
        image: '',
        address: 'Meetupstreet 5, 12345 Meetup City',
        description: 'This is a third meetup'
    }
]

function AllMeetupsPage() {
    return (
        <section>
            <h1>All meetup page</h1>
            <MeetupList meetups={DUMMY_DATA}/>
        </section>
    )
        ;
}

export default AllMeetupsPage;