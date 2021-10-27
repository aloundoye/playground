function NewMeetupPage(props) {
    return (
        <li>
            <div><img src="{props.image}" alt="{props.title}"/></div>
            <div>
                <h3>{props.title}</h3>
                <address>{props.address}</address>
                <p>D{props.description}</p>
            </div>
            <div>
                <button>To Favorites</button>
            </div>
        </li>
    );
}

export default NewMeetupPage;