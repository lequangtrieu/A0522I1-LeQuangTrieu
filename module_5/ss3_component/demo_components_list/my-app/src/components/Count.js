import React, {Component} from "react";

export class Count extends Component {
    constructor() {
        super();
        this.state = {
            number: 0
        }
    }

    increase = () => {
        this.setState({number: this.state.number + 1});
    }

    decrease = () => {
        this.setState({number: this.state.number - 1});
    }

    render() {
        return (
            <>
                <button onClick={this.decrease}>Decrease</button>
                <span style={{padding: 10}}>{this.state.number}</span>
                <button onClick={this.increase}>Increase</button>
            </>
        )
    }
}