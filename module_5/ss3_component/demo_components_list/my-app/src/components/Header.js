import React, {Component} from "react";

export class Header extends Component {
    render() {
        return (
            <>
                <h1>hello {this.props.studentName || 'No name'} </h1>
                <h1>{this.props.children}</h1>
            </>

        )
    }
}