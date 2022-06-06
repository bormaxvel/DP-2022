import { Gamepads } from "./gamepads";

export interface Rest1 {
    _embedded: {
        gamepads: Gamepads[]
        },
        _links: {
        self: {
        href: string;
        },
        profile: {
        href: string;
        }
        },
        page: {
        size: number,
        totalElements: number,
        totalPages: number,
        number: number
        }

}